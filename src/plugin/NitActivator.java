package plugin;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author lucas
 * The plugin activator, singleton
 */
public class NitActivator extends AbstractUIPlugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "ActivatorExample"; //$NON-NLS-1$
	
	// Compiler path string
	public static final String COMPILER_PATH_PREFERENCES_ID = "compilerLocation";
	
	// Compiler path string
	public static final String STDLIB_FOLDER_PREFERENCES_ID = "NitLibEditor";
	
	// Debug trigger
	public static final boolean DEBUG_MODE = false;

	// The shared instance
	private static NitActivator plugin;
	
	/**
	 * The constructor
	 */
	public NitActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static NitActivator getDefault() {
		if(plugin == null){
			plugin = new NitActivator();
		}
		return plugin;
	}

}
