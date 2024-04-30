package com.company.b4apush;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.company.b4apush.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.company.b4apush.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.FirebaseAnalyticsWrapper _analytics = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntakepicture = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.CameraW _cam = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnactivatecam = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnstoppreview = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnstartpreview = null;
public com.company.b4apush.main _main = null;
public com.company.b4apush.firebasemessaging _firebasemessaging = null;
public com.company.b4apush.starter _starter = null;
public com.company.b4apush.b4xpages _b4xpages = null;
public com.company.b4apush.b4xcollections _b4xcollections = null;
public void  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(com.company.b4apush.b4xmainpage parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
com.company.b4apush.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
boolean _haspermission = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 28;BA.debugLine="analytics.Initialize";
parent._analytics.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="Root = Root1";
parent._root = _root1;
 //BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"MainPage\")";
parent._root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 32;BA.debugLine="CallSubDelayed2(FirebaseMessaging, \"SubscribeToTo";
parent.__c.CallSubDelayed2(ba,(Object)(parent._firebasemessaging.getObject()),"SubscribeToTopics",(Object)(new Object[]{(Object)("general")}));
 //BA.debugLineNum = 36;BA.debugLine="Wait For (CheckAndRequestNotificationPermission)";
parent.__c.WaitFor("complete", ba, this, parent._checkandrequestnotificationpermission());
this.state = 5;
return;
case 5:
//C
this.state = 1;
_haspermission = (Boolean) result[0];
;
 //BA.debugLineNum = 37;BA.debugLine="If HasPermission = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_haspermission==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 38;BA.debugLine="Log(\"no permission\")";
parent.__c.LogImpl("1720907","no permission",0);
 //BA.debugLineNum = 39;BA.debugLine="ToastMessageShow(\"no permission\", True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("no permission"),parent.__c.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _haspermission) throws Exception{
}
public String  _btnactivatecam_click() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Private Sub BtnActivateCam_Click";
 //BA.debugLineNum = 72;BA.debugLine="cam.Initialize(Panel1, \"InitializeCam\")";
_cam.Initialize(ba,(android.view.ViewGroup)(_panel1.getObject()),"InitializeCam");
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _btnstartpreview_click() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Private Sub BtnStartPreview_Click";
 //BA.debugLineNum = 80;BA.debugLine="cam.StartPreview";
_cam.StartPreview();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _btnstoppreview_click() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub BtnStopPreview_Click";
 //BA.debugLineNum = 76;BA.debugLine="cam.StopPreview";
_cam.StopPreview();
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _btntakepicture_click() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub BtnTakePicture_Click";
 //BA.debugLineNum = 67;BA.debugLine="cam.TakePicture";
_cam.TakePicture();
 //BA.debugLineNum = 68;BA.debugLine="cam.Release";
_cam.Release();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkandrequestnotificationpermission() throws Exception{
ResumableSub_CheckAndRequestNotificationPermission rsub = new ResumableSub_CheckAndRequestNotificationPermission(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckAndRequestNotificationPermission extends BA.ResumableSub {
public ResumableSub_CheckAndRequestNotificationPermission(com.company.b4apush.b4xmainpage parent) {
this.parent = parent;
}
com.company.b4apush.b4xmainpage parent;
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _ctxt = null;
int _targetsdkversion = 0;
anywheresoftware.b4j.object.JavaObject _notificationsmanager = null;
boolean _notificationsenabled = false;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 49;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 50;BA.debugLine="If p.SdkVersion < 33 Then Return True";
if (true) break;

case 1:
//if
this.state = 6;
if (_p.getSdkVersion()<33) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 51;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 52;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
 //BA.debugLineNum = 53;BA.debugLine="Dim targetSdkVersion As Int = ctxt.RunMethodJO(\"g";
_targetsdkversion = (int)(BA.ObjectToNumber(_ctxt.RunMethodJO("getApplicationInfo",(Object[])(parent.__c.Null)).GetField("targetSdkVersion")));
 //BA.debugLineNum = 54;BA.debugLine="If targetSdkVersion < 33 Then Return True";
if (true) break;

case 7:
//if
this.state = 12;
if (_targetsdkversion<33) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 55;BA.debugLine="Dim NotificationsManager As JavaObject = ctxt.Run";
_notificationsmanager = new anywheresoftware.b4j.object.JavaObject();
_notificationsmanager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethod("getSystemService",new Object[]{(Object)("notification")})));
 //BA.debugLineNum = 56;BA.debugLine="Dim NotificationsEnabled As Boolean = Notificatio";
_notificationsenabled = BA.ObjectToBoolean(_notificationsmanager.RunMethod("areNotificationsEnabled",(Object[])(parent.__c.Null)));
 //BA.debugLineNum = 57;BA.debugLine="If NotificationsEnabled Then Return True";
if (true) break;

case 13:
//if
this.state = 18;
if (_notificationsenabled) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 58;BA.debugLine="Dim rp As RuntimePermissions";
parent._rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 59;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_POST_NOTIFICATIO";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_POST_NOTIFICATIONS);
 //BA.debugLineNum = 60;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 19;
return;
case 19:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 61;BA.debugLine="Log(Permission & \": \" & Result)";
parent.__c.LogImpl("1786445",_permission+": "+BA.ObjectToString(_result),0);
 //BA.debugLineNum = 62;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_permissionresult(String _permission,boolean _result) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private analytics As FirebaseAnalytics";
_analytics = new anywheresoftware.b4a.objects.FirebaseAnalyticsWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private BtnTakePicture As Button";
_btntakepicture = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
 //BA.debugLineNum = 15;BA.debugLine="Private BtnActivateCam As Button";
_btnactivatecam = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private BtnStopPreview As Button";
_btnstoppreview = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private BtnStartPreview As Button";
_btnstartpreview = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 22;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
_rp.CheckAndRequest(ba,_rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 23;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_S";
_rp.CheckAndRequest(ba,_rp.PERMISSION_WRITE_EXTERNAL_STORAGE);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
