
package com.wingon.pbn.protocol;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.external.activeandroid.Model;
import com.external.activeandroid.annotation.Column;
import com.external.activeandroid.annotation.Table;

@Table(name = "addressaddRequest")
public class addressaddRequest  extends Model
{

     @Column(name = "address")
     public ADDRESS   address;

     @Column(name = "session")
     public SESSION   session;

     public void  fromJson(JSONObject jsonObject)  throws JSONException
     {
          if(null == jsonObject){
            return ;
           }

          JSONArray subItemArray;
          ADDRESS  address = new ADDRESS();
          address.fromJson(jsonObject.optJSONObject("address"));
          this.address = address;
          SESSION  session = new SESSION();
          session.fromJson(jsonObject.optJSONObject("session"));
          this.session = session;
          return ;
     }

     public JSONObject  toJson() throws JSONException 
     {
          JSONObject localItemObject = new JSONObject();
          JSONArray itemJSONArray = new JSONArray();
          if(null != address)
          {
            localItemObject.put("address", address.toJson());
          }
          if(null != session)
          {
            localItemObject.put("session", session.toJson());
          }
          return localItemObject;
     }

}
