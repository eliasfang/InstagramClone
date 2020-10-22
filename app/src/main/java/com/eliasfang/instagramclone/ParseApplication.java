package com.eliasfang.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("paKBah8eBhJr7n70OzfCIIbx3YHXUNXHoSJCJRCE")
                .clientKey("WfT7WfSfgwR39DD9j0esmQ7pLDKkvk6mTn4dDPWe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
