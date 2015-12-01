package com.example.lx.android_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OptionsMenuActivity extends AppCompatActivity {

    private Button btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

        btn_menu = (Button) this.findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
 /*
         *
         * add()方法的四个参数，依次是：
         *
         * 1、组别，如果不分组的话就写Menu.NONE,
         *
         * 2、Id，这个很重要，Android根据这个Id来确定不同的菜单
         *
         * 3、顺序，那个菜单现在在前面由这个参数的大小决定
         *
         * 4、文本，菜单的显示文本
         */

        menu.add(Menu.NONE, Menu.FIRST + 1, 5, "删除").setIcon(android.R.drawable.ic_menu_delete);
        // setIcon()方法为菜单设置图标，这里使用的是系统自带的图标，同学们留意一下,以
        // android.R开头的资源是系统提供的，我们自己提供的资源是以R开头的
        menu.add(Menu.NONE, Menu.FIRST + 2, 2, "保存").setIcon(android.R.drawable.ic_menu_edit);
        menu.add(Menu.NONE, Menu.FIRST + 3, 6, "帮助").setIcon(android.R.drawable.ic_menu_help);
        menu.add(Menu.NONE, Menu.FIRST + 4, 1, "添加").setIcon(android.R.drawable.ic_menu_add);
        menu.add(Menu.NONE, Menu.FIRST + 5, 4, "详细").setIcon(android.R.drawable.ic_menu_info_details);
        menu.add(Menu.NONE, Menu.FIRST + 6, 3, "发送").setIcon(android.R.drawable.ic_menu_send);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case Menu.FIRST + 1:
                Toast.makeText(this, "删除菜单被点击了", Toast.LENGTH_LONG).show();
                break;

            case Menu.FIRST + 2:
                Toast.makeText(this, "保存菜单被点击了", Toast.LENGTH_LONG).show();
                break;

            case Menu.FIRST + 3:
                Toast.makeText(this, "帮助菜单被点击了", Toast.LENGTH_LONG).show();
                break;

            case Menu.FIRST + 4:
                Toast.makeText(this, "添加菜单被点击了", Toast.LENGTH_LONG).show();
                break;

            case Menu.FIRST + 5:
                Toast.makeText(this, "详细菜单被点击了", Toast.LENGTH_LONG).show();
                break;

            case Menu.FIRST + 6:
                Toast.makeText(this, "发送菜单被点击了", Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }
}
