package com.badlogicgames.plane;

import ios.NSObject;
import ios.foundation.NSDictionary;
import ios.uikit.UIApplication;
import ios.uikit.c.UIKit;
import ios.uikit.protocol.UIApplicationDelegate;

import com.badlogic.gdx.backends.migeran.IOSApplication;
import com.badlogic.gdx.backends.migeran.IOSApplicationConfiguration;
import com.migeran.natj.general.Pointer;
import com.migeran.natj.objc.ann.IsOptional;
import com.migeran.natj.objc.ann.ObjCClassName;
import com.migeran.natj.objc.ann.Selector;
import com.migeran.natj.general.ann.Generated;
import com.migeran.natj.general.NatJ;
import com.migeran.natj.objc.ann.NotImplemented;

import ios.uikit.UILocalNotification;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.coregraphics.struct.CGRect;

import com.migeran.natj.general.ann.ByValue;

import ios.uikit.UIWindow;
import ios.foundation.NSError;
import ios.uikit.UIViewController;
import ios.foundation.NSCoder;
import ios.foundation.NSURL;

import com.migeran.natj.objc.ann.ObjCBlock;
import ios.foundation.NSUserActivity;
import ios.uikit.UIUserNotificationSettings;

@ObjCClassName("PlaneGameIOS")
public class PlaneGameIOS extends NSObject implements UIApplicationDelegate {
	
	private com.badlogic.gdx.backends.migeran.IOSApplication app;

	@Override
	@Selector("application:didFinishLaunchingWithOptions:")
	public boolean applicationDidFinishLaunchingWithOptions(
			UIApplication application, NSDictionary launchOptions) {
		IOSApplicationConfiguration config = new IOSApplicationConfiguration();
		this.app = new IOSApplication(new MigeranPlaneGame(), config);
		return app.didFinishLaunching(application, launchOptions);
	}

	@Override
	@IsOptional
	@Selector("applicationDidBecomeActive:")
	public void applicationDidBecomeActive(UIApplication application) {
		app.didBecomeActive(application);
	}

	@Override
	@IsOptional
	@Selector("applicationWillResignActive:")
	public void applicationWillResignActive(UIApplication application) {
		app.willResignActive(application);
	}

	@Override
	@IsOptional
	@Selector("applicationWillTerminate:")
	public void applicationWillTerminate(UIApplication application) {
		app.willTerminate(application);
	}

	public static void main(String[] args) {
		UIKit.UIApplicationMain(0, null, null,
				PlaneGameIOS.class.getSimpleName());
	}
	
	@Selector("init")
	public PlaneGameIOS init() {
		super.init();
		return this;
	}

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didChangeStatusBarFrame:")
	public native void applicationDidChangeStatusBarFrame(
			UIApplication application, @ByValue CGRect oldStatusBarFrame);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didChangeStatusBarOrientation:")
	public native void applicationDidChangeStatusBarOrientation(
			UIApplication application, int oldStatusBarOrientation);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didDecodeRestorableStateWithCoder:")
	public native void applicationDidDecodeRestorableStateWithCoder(
			UIApplication application, NSCoder coder);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didFailToRegisterForRemoteNotificationsWithError:")
	public native void applicationDidFailToRegisterForRemoteNotificationsWithError(
			UIApplication application, NSError error);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didReceiveLocalNotification:")
	public native void applicationDidReceiveLocalNotification(
			UIApplication application, UILocalNotification notification);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didReceiveRemoteNotification:")
	public native void applicationDidReceiveRemoteNotification(
			UIApplication application, NSDictionary userInfo);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
	public native void applicationDidRegisterForRemoteNotificationsWithDeviceToken(
			UIApplication application, NSData deviceToken);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:handleOpenURL:")
	public native boolean applicationHandleOpenURL(UIApplication application,
			NSURL url);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:openURL:sourceApplication:annotation:")
	public native boolean applicationOpenURLSourceApplicationAnnotation(
			UIApplication application, NSURL url, String sourceApplication,
			Object annotation);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:shouldRestoreApplicationState:")
	public native boolean applicationShouldRestoreApplicationState(
			UIApplication application, NSCoder coder);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:shouldSaveApplicationState:")
	public native boolean applicationShouldSaveApplicationState(
			UIApplication application, NSCoder coder);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:supportedInterfaceOrientationsForWindow:")
	public native int applicationSupportedInterfaceOrientationsForWindow(
			UIApplication application, UIWindow window);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:viewControllerWithRestorationIdentifierPath:coder:")
	public native UIViewController applicationViewControllerWithRestorationIdentifierPathCoder(
			UIApplication application, NSArray identifierComponents,
			NSCoder coder);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:willChangeStatusBarFrame:")
	public native void applicationWillChangeStatusBarFrame(
			UIApplication application, @ByValue CGRect newStatusBarFrame);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:willChangeStatusBarOrientation:duration:")
	public native void applicationWillChangeStatusBarOrientationDuration(
			UIApplication application, int newStatusBarOrientation,
			double duration);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:willEncodeRestorableStateWithCoder:")
	public native void applicationWillEncodeRestorableStateWithCoder(
			UIApplication application, NSCoder coder);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("application:willFinishLaunchingWithOptions:")
	public native boolean applicationWillFinishLaunchingWithOptions(
			UIApplication application, NSDictionary launchOptions);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationDidEnterBackground:")
	public native void applicationDidEnterBackground(UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationDidFinishLaunching:")
	public native void applicationDidFinishLaunching(UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationDidReceiveMemoryWarning:")
	public native void applicationDidReceiveMemoryWarning(
			UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationProtectedDataDidBecomeAvailable:")
	public native void applicationProtectedDataDidBecomeAvailable(
			UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationProtectedDataWillBecomeUnavailable:")
	public native void applicationProtectedDataWillBecomeUnavailable(
			UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationSignificantTimeChange:")
	public native void applicationSignificantTimeChange(
			UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("applicationWillEnterForeground:")
	public native void applicationWillEnterForeground(UIApplication application);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("setWindow:")
	public native void setWindow(UIWindow value);

	@NotImplemented
	@Override
	@IsOptional
	@Selector("window")
	public native UIWindow window();

	@NotImplemented
	@Override
	@Selector("application:didReceiveRemoteNotification:fetchCompletionHandler:")
	@IsOptional
	public native void applicationDidReceiveRemoteNotificationFetchCompletionHandler(
			UIApplication application,
			NSDictionary userInfo,
			@ObjCBlock(name = "applicationDidReceiveRemoteNotificationFetchCompletionHandler") UIApplicationDelegate.Block_applicationDidReceiveRemoteNotificationFetchCompletionHandler completionHandler);

	@NotImplemented
	@Override
	@Selector("application:handleEventsForBackgroundURLSession:completionHandler:")
	@IsOptional
	public native void applicationHandleEventsForBackgroundURLSessionCompletionHandler(
			UIApplication application,
			String identifier,
			@ObjCBlock(name = "applicationHandleEventsForBackgroundURLSessionCompletionHandler") UIApplicationDelegate.Block_applicationHandleEventsForBackgroundURLSessionCompletionHandler completionHandler);

	@NotImplemented
	@Override
	@Selector("application:performFetchWithCompletionHandler:")
	@IsOptional
	public native void applicationPerformFetchWithCompletionHandler(
			UIApplication application,
			@ObjCBlock(name = "applicationPerformFetchWithCompletionHandler") UIApplicationDelegate.Block_applicationPerformFetchWithCompletionHandler completionHandler);

	static {
		NatJ.register();
	}

	@Generated("NatJ")
	@Selector("alloc")
	public static native PlaneGameIOS alloc();

	@Generated("NatJ")
	protected PlaneGameIOS(Pointer peer) {
		super(peer);
	}

	@NotImplemented
	@Override
	@Selector("application:continueUserActivity:restorationHandler:")
	@IsOptional
	public native boolean applicationContinueUserActivityRestorationHandler(
			UIApplication application,
			NSUserActivity userActivity,
			@ObjCBlock(name = "call_applicationContinueUserActivityRestorationHandler") UIApplicationDelegate.Block_applicationContinueUserActivityRestorationHandler restorationHandler);

	@NotImplemented
	@Override
	@Selector("application:didFailToContinueUserActivityWithType:error:")
	@IsOptional
	public native void applicationDidFailToContinueUserActivityWithTypeError(
			UIApplication application, String userActivityType, NSError error);

	@NotImplemented
	@Override
	@Selector("application:didRegisterUserNotificationSettings:")
	@IsOptional
	public native void applicationDidRegisterUserNotificationSettings(
			UIApplication application,
			UIUserNotificationSettings notificationSettings);

	@NotImplemented
	@Override
	@Selector("application:didUpdateUserActivity:")
	@IsOptional
	public native void applicationDidUpdateUserActivity(
			UIApplication application, NSUserActivity userActivity);

	@NotImplemented
	@Override
	@Selector("application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
	@IsOptional
	public native void applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler(
			UIApplication application,
			String identifier,
			UILocalNotification notification,
			@ObjCBlock(name = "call_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler") UIApplicationDelegate.Block_applicationHandleActionWithIdentifierForLocalNotificationCompletionHandler completionHandler);

	@NotImplemented
	@Override
	@Selector("application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
	@IsOptional
	public native void applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler(
			UIApplication application,
			String identifier,
			NSDictionary userInfo,
			@ObjCBlock(name = "call_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler") UIApplicationDelegate.Block_applicationHandleActionWithIdentifierForRemoteNotificationCompletionHandler completionHandler);

	@NotImplemented
	@Override
	@Selector("application:shouldAllowExtensionPointIdentifier:")
	@IsOptional
	public native boolean applicationShouldAllowExtensionPointIdentifier(
			UIApplication application, String extensionPointIdentifier);

	@NotImplemented
	@Override
	@Selector("application:willContinueUserActivityWithType:")
	@IsOptional
	public native boolean applicationWillContinueUserActivityWithType(
			UIApplication application, String userActivityType);
	
}
