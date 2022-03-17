package com.example.appmusic.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.appmusic.Adapter.BannerAdapter;
import com.example.appmusic.R;

import me.relex.circleindicator.CircleIndicator;

public class Fragment_Banner extends Fragment {
    View view;
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    BannerAdapter bannerAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_banner, container, false);
        anhxa();
//        GetData();
        return view;
    }
    private void anhxa()
    {
        viewPager = viewPager.findViewById(R.id.viewpager);
        circleIndicator = view.findViewById(R.id.indicatordefault);

    }
}
