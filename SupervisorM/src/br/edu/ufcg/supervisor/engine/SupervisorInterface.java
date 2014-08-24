package br.edu.ufcg.supervisor.engine;

import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SupervisorInterface  extends org.apache.cordova.api.CordovaPlugin {

	 public SupervisorInterface() { }
	   public void initialize(org.apache.cordova.api.CordovaInterface cordova, CordovaWebView webView) {
	        super.initialize(cordova, webView);
	    }

	    public boolean execute(String action, JSONArray args, org.apache.cordova.api.CallbackContext callbackContext) throws JSONException {
	        if (action.equals("getFilePath")) {
	        	String str = args.get(0).toString();
	        	System.out.println(str);
	        	System.out.println(TrainingLoader.getFilePath(str));
	            JSONObject r = new JSONObject();
	            r.put("uuid", "ddddd");
	            callbackContext.success(r);
	        }
	        else { return false; }
	        return true;
	    }
	    
	    
}
