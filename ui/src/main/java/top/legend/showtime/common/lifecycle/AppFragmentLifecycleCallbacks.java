package top.legend.showtime.common.lifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/18
 */

public class AppFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {

    /**
     * Called right before the fragment's {@link Fragment#onAttach(Context)} method is called.
     * This is a good time to inject any required dependencies for the fragment before any of
     * the fragment's lifecycle methods are invoked.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     * @param context Context that the Fragment is being attached to
     */
    public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {}

    /**
     * Called after the fragment has been attached to its host. Its host will have had
     * <code>onAttachFragment</code> called before this call happens.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     * @param context Context that the Fragment was attached to
     */
    public void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onCreate(Bundle)}. This will only happen once for any given
     * fragment instance, though the fragment may be attached and detached multiple times.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     * @param savedInstanceState Saved instance bundle from a previous instance
     */
    public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onActivityCreated(Bundle)}. This will only happen once for any given
     * fragment instance, though the fragment may be attached and detached multiple times.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     * @param savedInstanceState Saved instance bundle from a previous instance
     */
    public void onFragmentActivityCreated(FragmentManager fm, Fragment f,
                                          Bundle savedInstanceState) {}

    /**
     * Called after the fragment has returned a non-null view from the FragmentManager's
     * request to {@link Fragment#onCreateView(LayoutInflater, ViewGroup, Bundle)}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment that created and owns the view
     * @param v View returned by the fragment
     * @param savedInstanceState Saved instance bundle from a previous instance
     */
    public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v,
                                      Bundle savedInstanceState) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onStart()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentStarted(FragmentManager fm, Fragment f) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onResume()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentResumed(FragmentManager fm, Fragment f) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onPause()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentPaused(FragmentManager fm, Fragment f) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onStop()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentStopped(FragmentManager fm, Fragment f) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onSaveInstanceState(Bundle)}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     * @param outState Saved state bundle for the fragment
     */
    public void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onDestroyView()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onDestroy()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentDestroyed(FragmentManager fm, Fragment f) {}

    /**
     * Called after the fragment has returned from the FragmentManager's call to
     * {@link Fragment#onDetach()}.
     *
     * @param fm Host FragmentManager
     * @param f Fragment changing state
     */
    public void onFragmentDetached(FragmentManager fm, Fragment f) {}
}
