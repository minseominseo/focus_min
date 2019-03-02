package com.bobo.min.fucusCam;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.aryan.dhankar.customcamera.R;
import com.squareup.picasso.Picasso;

import java.io.File;

public class NewActivity extends AppCompatActivity {
ImageView mPreview;
    private static final int PREVIEW_SIZE = 800;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        String path=getIntent().getStringExtra("filepath");
/*
        String path2 = Environment.getExternalStorageDirectory().getAbsolutePath();

        String folderPath = path2 + File.separator +folderName;
        filePath =path2 +File.separator+folderName +File.separator+fileName +"mp4";
        File fileFolderPath = new File(folderPath);
        fileFolderPath.mkdir();

        File file = new File(filePath);
        Uri outputFileURi =Uri.fromFile(file);
*/
        mPreview=findViewById(R.id.mPreview);
        if (path.contains("mp4")){
            File file=new File(path);
            Picasso.with(this)
                    .load(R.drawable.ic_action_info)
                    .noFade()
                    .noPlaceholder()
                    .resize(PREVIEW_SIZE, PREVIEW_SIZE)
                    .centerCrop().skipMemoryCache()
                    .into(mPreview);

        }else {
            File file=new File(path);
            Picasso.with(this)
                    .load(Uri.fromFile(file))
                    .noFade()
                    .noPlaceholder()
                    .resize(PREVIEW_SIZE, PREVIEW_SIZE)
                    .centerCrop().skipMemoryCache()
                    .into(mPreview);

        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
