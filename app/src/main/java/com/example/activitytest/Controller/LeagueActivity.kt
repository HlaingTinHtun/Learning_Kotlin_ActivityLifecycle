package com.example.activitytest.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.activitytest.Model.Player
import com.example.activitytest.R
import com.example.activitytest.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onMenClicked(view: View){
        womenLeagueBtn.isChecked = false
        otherLeagueBtn.isChecked = false
        player.league = "men"
    }

    fun onWomenClicked(view: View){
        menLeagueBtn.isChecked = false
        otherLeagueBtn.isChecked = false
        player.league = "women"
    }

    fun onOtherClicked(view: View){
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false
        player.league = "other"
    }

    fun leagueNextClicked(view: View){
        if (player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }


}
