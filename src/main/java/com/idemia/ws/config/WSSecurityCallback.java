package com.idemia.ws.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class WSSecurityCallback implements CallbackHandler {

	private Map<String, String> userPasswords = new HashMap<>();

	public WSSecurityCallback() {
		userPasswords.put("wsuser", "wspassword");
		userPasswords.put("admin", "password");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback callback = (WSPasswordCallback) callbacks[0];

		String id = callback.getIdentifier();
		String pass = null;
		switch (callback.getUsage()) {
		case WSPasswordCallback.USERNAME_TOKEN:
			pass = userPasswords.get(id);
			callback.setPassword(pass);
			break;
		}

	}

}
