package com.example.activitytest.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest.Model.Player
import com.example.activitytest.R
import com.example.activitytest.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking For ${player.league} ${player.skill} league near you ..."
    }
}
