package bh.edu.ahlia.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    int[] images = {R.drawable.allad, R.drawable.avatar, R.drawable.endgame, R.drawable.frozen,
    R.drawable.spiderman, R.drawable.gladiators, R.drawable.littlemermaid};

    String[] names = {"Aladdin","AVATAR","Avengers Endgame","FROZEN","Spider man","Gladiators",
    "Little Mermaid"};

    String[] decrpition = {"11 Music", "14 Music", "9 Music", "8 Music", "7 Music", "5 Music", "9 Music"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ListView listView = findViewById( R.id.listView );

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter( customAdapter );
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Intent myintent = new Intent( view.getContext(),Main2Activity.class );
                    startActivityForResult( myintent,0 );
                }
                if (i == 1){
                    Intent myintent = new Intent( view.getContext(),Main3Activity.class );
                    startActivityForResult( myintent,1 );
                }
                if (i == 2){
                    Intent myintent = new Intent( view.getContext(),Main4Activity.class );
                    startActivityForResult( myintent,2 );
                }
                if (i == 3){
                    Intent myintent = new Intent( view.getContext(),Main5Activity.class );
                    startActivityForResult( myintent,3 );
                }
                if (i == 4){
                    Intent myintent = new Intent( view.getContext(),Main6Activity.class );
                    startActivityForResult( myintent,4 );
                }
                if (i == 5){
                    Intent myintent = new Intent( view.getContext(),Main7Activity.class );
                    startActivityForResult( myintent,5 );
                }
                if (i == 6){
                    Intent myintent = new Intent( view.getContext(),Main8Activity.class );
                    startActivityForResult( myintent,6 );
                }

            }
        } );
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate( R.layout.customlayout,null );

            ImageView imageView = (ImageView)view.findViewById( R.id.imageView );
            TextView textView = (TextView)view.findViewById( R.id.txtName );
            TextView textView_music = (TextView)view.findViewById( R.id.txtdesc );

            imageView.setImageResource( images[i] );
            textView.setText( names[i] );
            textView_music.setText( decrpition[i] );

            return view;
        }
    }






}
