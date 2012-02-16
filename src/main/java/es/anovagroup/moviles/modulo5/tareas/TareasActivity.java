/**
 * Anova IT Consulting 2011
 *
 * This file is licensed under the GPL version 3.
 * Please refer to the URL http://www.gnu.org/licenses/gpl-3.0.html for details.
 */

package es.anovagroup.moviles.modulo5.tareas;

import com.phonegap.DroidGap;

import android.os.Bundle;
import android.util.Log;

public class TareasActivity extends DroidGap {

	private static String TAG = "tareas";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		super.loadUrl("file:///android_asset/www/index.html");
	}
}
