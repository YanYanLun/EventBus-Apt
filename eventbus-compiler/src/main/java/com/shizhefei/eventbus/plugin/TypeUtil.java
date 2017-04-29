package com.shizhefei.eventbus.plugin;

import com.squareup.javapoet.ClassName;

/**
 * Created by LuckyJayce on 2017/3/21.
 */

public class TypeUtil {
    public static final ClassName eventHandler = ClassName.get("com.shizhefei.eventbus", "EventHandler");
    public static final ClassName ieventHandler = ClassName.get("com.shizhefei.eventbus", "IEventHandler");
    public static final ClassName Subscribe = ClassName.get("com.shizhefei.eventbus", "Subscribe");
    public static final ClassName Util = ClassName.get("com.shizhefei.eventbus", "Util");
    public static final ClassName activity = ClassName.get("android.app", "Activity");
    public static final ClassName EventProxy = ClassName.get("com.shizhefei.eventbus", "EventProxy");
    public static final ClassName EventProxyFactory = ClassName.get("com.shizhefei.eventbus", "EventHandler.EventImpFactory");
    public static final ClassName ievent = ClassName.get("com.shizhefei.eventbus", "IEvent");
    public static final ClassName NonNull = ClassName.get("android.support.annotation", "NonNull");
    public static final String Event = "com.shizhefei.eventbus.annotation.Event";
}
