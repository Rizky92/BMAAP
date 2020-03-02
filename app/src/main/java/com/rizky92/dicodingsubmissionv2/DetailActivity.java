package com.rizky92.dicodingsubmissionv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.rizky92.dicodingsubmissionv2.model.Hape;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvNama;
    TextView tvAnnounced;
    TextView tvStatus;
    TextView tvNetwork;
    TextView tvDimensions;
    TextView tvWeight;
    TextView tvBuild;
    TextView tvSim;
    TextView tvType;
    TextView tvSize;
    TextView tvRes;
    TextView tvOs;
    TextView tvChipset;
    TextView tvCpu;
    TextView tvGpu;
    TextView tvRam;
    TextView tvInternal;
    TextView tvExternal;
    TextView tvRearCam;
    TextView tvRearFeat;
    TextView tvRearVideo;
    TextView tvFrontCam;
    TextView tvFrontFeat;
    TextView tvFrontVideo;
    TextView tvSpeaker;
    TextView tvJack;
    TextView tvWlan;
    TextView tvBluetooth;
    TextView tvRadio;
    TextView tvUsb;
    TextView tvSensors;
    TextView tvBattery;
    TextView tvPrice;
    ImageView img;

    public static final String EXTRA_HAPE = "extra_hape";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Button btnOke = findViewById(R.id.btn_oke);
        btnOke.setOnClickListener(this);

        img = findViewById(R.id.img_item_foto);

        tvNama = findViewById(R.id.tv_name);
        tvPrice = findViewById(R.id.tv_price);

        tvAnnounced = findViewById(R.id.tv_launch_announced);
        tvStatus = findViewById(R.id.tv_launch_status);

        tvDimensions = findViewById(R.id.tv_body_dimensions);
        tvWeight = findViewById(R.id.tv_body_weight);
        tvBuild = findViewById(R.id.tv_body_build);
        tvSim = findViewById(R.id.tv_body_sim);

        tvType = findViewById(R.id.tv_display_type);
        tvSize = findViewById(R.id.tv_display_size);
        tvRes = findViewById(R.id.tv_display_resolution);

        tvOs = findViewById(R.id.tv_platform_os);
        tvChipset = findViewById(R.id.tv_platform_chipset);
        tvCpu = findViewById(R.id.tv_platform_cpu);
        tvGpu = findViewById(R.id.tv_platform_gpu);

        tvRam = findViewById(R.id.tv_memory_ram);
        tvInternal = findViewById(R.id.tv_memory_internal);
        tvExternal = findViewById(R.id.tv_memory_external);

        tvRearCam = findViewById(R.id.tv_r_cam_main);
        tvRearFeat = findViewById(R.id.tv_r_cam_feat);
        tvRearVideo = findViewById(R.id.tv_r_cam_vid);

        tvFrontCam = findViewById(R.id.tv_f_cam_main);
        tvFrontFeat = findViewById(R.id.tv_f_cam_feat);
        tvFrontVideo = findViewById(R.id.tv_f_cam_vid);

        tvSpeaker = findViewById(R.id.tv_sound_speaker);
        tvJack = findViewById(R.id.tv_sound_jack);

        tvWlan = findViewById(R.id.tv_comm_wlan);
        tvBluetooth = findViewById(R.id.tv_comm_bt);
        tvRadio = findViewById(R.id.tv_comm_radio);
        tvNetwork = findViewById(R.id.tv_comm_network);

        tvUsb = findViewById(R.id.tv_feat_usb);
        tvSensors = findViewById(R.id.tv_feat_sensors);
        tvBattery = findViewById(R.id.tv_feat_battery);

        Hape hape = getIntent().getParcelableExtra(EXTRA_HAPE);

        tvNama.setText(hape.getNama());
        tvPrice.setText(hape.getPrice());

        tvAnnounced.setText(hape.getAnnounced());
        tvStatus.setText(hape.getStatus());

        tvDimensions.setText(hape.getDimensions());
        tvWeight.setText(hape.getWeight());
        tvBuild.setText(hape.getBuild());
        tvSim.setText(hape.getSim());

        tvType.setText(hape.getType());
        tvSize.setText(hape.getSize());
        tvRes.setText(hape.getRes());

        tvOs.setText(hape.getOs());
        tvChipset.setText(hape.getChipset());
        tvCpu.setText(hape.getCpu());
        tvGpu.setText(hape.getGpu());

        tvRam.setText(hape.getRam());
        tvInternal.setText(hape.getInternal());
        tvExternal.setText(hape.getExternal());

        tvRearCam.setText(hape.getRearCam());
        tvRearFeat.setText(hape.getRearFeat());
        tvRearVideo.setText(hape.getRearVideo());

        tvFrontCam.setText(hape.getFrontCam());
        tvFrontFeat.setText(hape.getFrontFeat());
        tvFrontVideo.setText(hape.getFrontVideo());

        tvSpeaker.setText(hape.getSpeaker());
        tvJack.setText(hape.getJack());

        tvWlan.setText(hape.getWlan());
        tvBluetooth.setText(hape.getBluetooth());
        tvRadio.setText(hape.getRadio());
        tvNetwork.setText(hape.getNetwork());

        tvUsb.setText(hape.getUsb());
        tvSensors.setText(hape.getSensors());
        tvBattery.setText(hape.getBattery());

        Picasso.get().load(hape.getFoto()).into(img);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_oke) {
            finish();
        }
    }
}
