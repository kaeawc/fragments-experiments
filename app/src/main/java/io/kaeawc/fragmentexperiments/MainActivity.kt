package io.kaeawc.fragmentexperiments

import android.os.Bundle
import android.support.v4.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        supportFragmentManager
                .beginTransaction()
                .add(R.id.container_a, RedFragment())
                .commit()

        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.translate_from_bottom, R.anim.stay_long)
                .add(R.id.container_b, BlueFragment())
                .commit()
    }
}
