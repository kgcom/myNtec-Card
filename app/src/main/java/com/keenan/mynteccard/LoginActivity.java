package com.keenan.mynteccard;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    EditText etemail , etpassword;
    private Button btnLogin;
    TextView tvregister;
    private RequestQueue requestQueue;
    private static final String URL = "http://192.168.1.4/jsonmysql/login.php";
    private StringRequest request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etemail=(EditText)findViewById(R.id.etLoginEmail);
        etpassword=(EditText)findViewById(R.id.etLoginPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        requestQueue = Volley.newRequestQueue(this);

        tvregister=(TextView)findViewById(R.id.tvGoToRegister);
        // SQLite database handler

        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                // Toast.makeText(getApplication(),"Poop",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            if(jsonObject.names().get(0).equals("success")){
                                Toast.makeText(getApplicationContext(),"SUCCESS:"+jsonObject.getString("success"),Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }else {
                                Toast.makeText(getApplicationContext(), "Error: " +jsonObject.getString("error"), Toast.LENGTH_SHORT).show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String,String> hashMap = new HashMap<String, String>();
                        hashMap.put("email",etemail.getText().toString());
                        hashMap.put("password",etpassword.getText().toString());

                        return hashMap;
                    }
                };

                requestQueue.add(request);
            }
        });
    }





    public void register(View view){
        Intent intent = new Intent (this,RegisterActivity.class);
        startActivity(intent);
    }
}
