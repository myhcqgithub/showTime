package top.legend.commonlibssample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import top.legend.commonlibrary.base.DefaultPagerAdapter;
import top.legend.commonlibssample.R;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class ViewPagerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_viewpager, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager vp = (ViewPager) view.findViewById(R.id.vp);
        vp.setAdapter(new DefaultPagerAdapter<String>(Arrays.asList("111", "2222", "22222"), R.layout.item_viewpage) {

            @Override
            public void convert(View view, String item, int position) {

            }
        });

    }
}
