package com.example.activitytest.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.activitytest.Utilities.EXTRA_LEAGUE
import com.example.activitytest.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selecetedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View){
        womenLeagueBtn.isChecked = false
        otherLeagueBtn.isChecked = false
        selecetedLeague = "men"
    }

    fun onWomenClicked(view: View){
        menLeagueBtn.isChecked = false
        otherLeagueBtn.isChecked = false
        selecetedLeague = "women"
    }

    fun onOtherClicked(view: View){
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false
        selecetedLeague = "other"
    }

    fun leagueNextClicked(view: View){
        if (selecetedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selecetedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }


}
