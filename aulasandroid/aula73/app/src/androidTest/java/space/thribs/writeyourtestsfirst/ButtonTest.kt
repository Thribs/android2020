package space.thribs.writeyourtestsfirst

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonTest {
    @Test
    fun typeInText() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        onView(withId(R.id.editTextTextField)).perform(typeText("Teste DDH"))
        assertEquals("Teste DH", appContext)
    }

}