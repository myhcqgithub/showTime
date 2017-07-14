package top.legend.commonlibssample;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import top.legend.commonlibrary.base.DefaultFragmentPageAdapter;
import top.legend.commonlibrary.model.Entity;
import top.legend.commonlibssample.fragment.BlankFragment;
import top.legend.commonlibssample.fragment.ViewPagerFragment;

public class MainActivity extends AppCompatActivity  implements BlankFragment.OnFragmentInteractionListener {
    private TabLayout mTl;
    private ViewPager mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }

    private void assignViews() {
        mTl = (TabLayout) findViewById(R.id.tl);
        mVp = (ViewPager) findViewById(R.id.vp);

        mVp.setAdapter(new DefaultFragmentPageAdapter(getSupportFragmentManager(), initData()));
        mTl.setupWithViewPager(mVp);

    }

    private List<Entity> initData() {

        List<Entity> entities = new ArrayList<>();
        Entity e = new Entity() {
            @Override
            public Fragment getFragment() {
                return BlankFragment.newInstance("1111", "2222");
            }

            @Override
            public String getTitle() {
                return "hello";
            }
        };
        entities.add(new Entity() {
            @Override
            public Fragment getFragment() {
                return new ViewPagerFragment();
            }

            @Override
            public String getTitle() {
                return "pager";
            }
        });
        entities.add(e);
        entities.add(e);
        entities.add(e);
        entities.add(e);
        return entities;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
