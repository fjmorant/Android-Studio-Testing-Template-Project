package com.morant.testingTemplate.test.activities;

import android.widget.TextView;
import com.morant.testingTemplate.R;
import com.morant.testingTemplate.activities.HomeActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertTrue;
import static org.robolectric.Robolectric.buildActivity;

/**
 * Created by morant84 on 16/06/2014.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "/src/main/AndroidManifest.xml")
public class HomeActivityTest {

    private final ActivityController<HomeActivity> controller = buildActivity(HomeActivity.class);
    private HomeActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = controller.create().start().resume().get();

    }

    @Test
    public void testAddItemToResult() throws Exception {
        //activity.findViewById(R.id.add_one).performClick();
        //activity.findViewById(R.id.add_one).performClick();

        TextView resultTextView = (TextView) activity.findViewById(R.id.resultTextView);
        assertTrue(resultTextView.getText().toString().equals("0"));
    }
}
