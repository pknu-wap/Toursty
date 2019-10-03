package com.example.tripproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    GridView gridView;

    int[] numberImage = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,
            R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};

    LinearLayout su_page,gg_page,ic_page,gw_page,dj_page,cn_page,cb_page,gj_page,jn_page,jb_page,dg_page,gb_page,gn_page,us_page,bs_page,jj_page;

    Button fsu, fgg, fic, fgw, fdj, fcn, fcb, fgj, fjn, fjb, fdg, fgb, fgn, fus, fbs, fjj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_su);

        MainAdapter adapter = new MainAdapter(MainActivity.this, numberImage);
        gridView.setAdapter(adapter);


        su_page = (LinearLayout)findViewById(R.id.frame_su);
        gg_page = (LinearLayout)findViewById(R.id.frame_gg);
        ic_page = (LinearLayout)findViewById(R.id.frame_ic);
        gw_page = (LinearLayout)findViewById(R.id.frame_gw);
        dj_page = (LinearLayout)findViewById(R.id.frame_ic);
        cn_page = (LinearLayout)findViewById(R.id.frame_cn);
        cb_page = (LinearLayout)findViewById(R.id.frame_cb);
        gj_page = (LinearLayout)findViewById(R.id.frame_gj);
        jn_page = (LinearLayout)findViewById(R.id.frame_jn);
        jb_page = (LinearLayout)findViewById(R.id.frame_jb);
        dg_page = (LinearLayout)findViewById(R.id.frame_dg);
        gb_page = (LinearLayout)findViewById(R.id.frame_gb);
        gn_page = (LinearLayout)findViewById(R.id.frame_gn);
        us_page = (LinearLayout)findViewById(R.id.frame_us);
        bs_page = (LinearLayout)findViewById(R.id.frame_bs);
        jj_page = (LinearLayout)findViewById(R.id.frame_jj);

        su_page.setVisibility(View.VISIBLE);
        gg_page.setVisibility(View.INVISIBLE);
        ic_page.setVisibility(View.INVISIBLE);
        gw_page.setVisibility(View.INVISIBLE);
        dj_page.setVisibility(View.INVISIBLE);
        cn_page.setVisibility(View.INVISIBLE);
        cb_page.setVisibility(View.INVISIBLE);
        gj_page.setVisibility(View.INVISIBLE);
        jn_page.setVisibility(View.INVISIBLE);
        jb_page.setVisibility(View.INVISIBLE);
        dg_page.setVisibility(View.INVISIBLE);
        gb_page.setVisibility(View.INVISIBLE);
        gn_page.setVisibility(View.INVISIBLE);
        us_page.setVisibility(View.INVISIBLE);
        bs_page.setVisibility(View.INVISIBLE);
        jj_page.setVisibility(View.INVISIBLE);

        fsu = (Button)findViewById(R.id.f_seoul);
        fsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.VISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fgg = (Button)findViewById(R.id.f_gg);
        fgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.VISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fic = (Button)findViewById(R.id.f_ic);
        fic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.VISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fgw = (Button)findViewById(R.id.f_gw);
        fgw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.VISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fdj = (Button)findViewById(R.id.f_dj);
        fdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.VISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fcn = (Button)findViewById(R.id.f_cn);
        fcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.VISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fcb = (Button)findViewById(R.id.f_cb);
        fcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.VISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fgj = (Button)findViewById(R.id.f_gj);
        fgj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.VISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fjn = (Button)findViewById(R.id.f_jn);
        fjn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.VISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fjb = (Button)findViewById(R.id.f_jb);
        fjb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fdg = (Button)findViewById(R.id.f_dg);
        fdg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.VISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fgb = (Button)findViewById(R.id.f_gb);
        fgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.VISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fgn = (Button)findViewById(R.id.f_gn);
        fgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.VISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fus = (Button)findViewById(R.id.f_us);
        fus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.VISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fbs = (Button)findViewById(R.id.f_bs);
        fbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.VISIBLE);
                jj_page.setVisibility(View.INVISIBLE);
            }
        });
        fjj = (Button)findViewById(R.id.f_jj);
        fjj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_page.setVisibility(View.INVISIBLE);
                gg_page.setVisibility(View.INVISIBLE);
                ic_page.setVisibility(View.INVISIBLE);
                gw_page.setVisibility(View.INVISIBLE);
                dj_page.setVisibility(View.INVISIBLE);
                cn_page.setVisibility(View.INVISIBLE);
                cb_page.setVisibility(View.INVISIBLE);
                gj_page.setVisibility(View.INVISIBLE);
                jn_page.setVisibility(View.INVISIBLE);
                jb_page.setVisibility(View.INVISIBLE);
                dg_page.setVisibility(View.INVISIBLE);
                gb_page.setVisibility(View.INVISIBLE);
                gn_page.setVisibility(View.INVISIBLE);
                us_page.setVisibility(View.INVISIBLE);
                bs_page.setVisibility(View.INVISIBLE);
                jj_page.setVisibility(View.VISIBLE);
            }
        });

    };

}


