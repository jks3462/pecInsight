package com.example.jaskirat.pec;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView studentImage;





    public void onClick(View v) {
        Intent intent= new Intent(this, ClubHome.class);
        ImageView imageView=null;
        String clubNameToSend=null;
        byte[] byteArray=null;
        Bitmap bmp;
        ByteArrayOutputStream stream;
        String clubDescription=null;
        switch(v.getId()) {

            case R.id.apc:
                imageView=(ImageView) findViewById(R.id.imageapc);
                clubNameToSend="APC";
                clubDescription="Art and Photography Club is a blend of people who want to capture and create beauty." +
                        " The club aims to create the opportunities for everyone to discover the artist within themselves." +
                        " It also gives them the platform to paint their dreams into reality.\n" +
                        "\n" +"We are a group of like-minded people who have a child’s eye for observation," +
                        " an artist’s taste for beauty and a poet’s expression for emotion. We like to click " +
                        "and paint a bigger picture of our vision. Our purpose is to encourage people to express " +
                        "their thoughts and emotions through art or photography. We urge art and photography " +
                        "fanatics to gather and exchange their knowledge, with the help of events such as workshops," +
                        " exhibitions and photography tours.";
                break;

            case R.id.asce:
                imageView=(ImageView) findViewById(R.id.imageasce);
                clubNameToSend="ASCE";
                clubDescription="ASCE-PEC is the International Student Group of the American Society of " +
                        "Civil Engineers and is the first society in the college entirely dedicated to " +
                        "Civil Engineering. Inaugurated on 31st January 2014, the society is the latest " +
                        "addition to the societies of the university.\n" +
                        "\n" +
                        "Founded in 1852, the American Society of Civil Engineers (ASCE) represents more " +
                        "than 145,000 members of the civil engineering profession worldwide and is America’s " +
                        "oldest national engineering society.\n" +
                        "\n" +
                        "Objectives of the International Student Group at PEC:\n" +
                        "\n" +
                        "Facilitate the advancement of technology to enhance quality, knowledge, competitiveness" +
                        " and sustainability.\n" +
                        "Develop student’s technical understanding through workshops, seminars and guest lectures.\n" +
                        "Encouraging students to participate in technical fests, conferences and workshops.\n" +
                        "Develop framework for students and industry interaction.";
                break;

            case R.id.communication:
                imageView=(ImageView) findViewById(R.id.imagecommunication);
                clubNameToSend="Communication";
                clubDescription="Communication Club is the student media body of the college.  It is the youngest club of " +
                        "the institute and is responsible for handling PR activities of the college. " +
                        "It caters to the three major domains of the institute including Public Relations, Website and Facebook " +
                        "Page Management and Official Newspaper/Newsletter of the institute.\n" +
                        "\n" +
                        "Public relations – The club manages the media relations of the institute and keeps the media " +
                        "updated with the happenings at the institute. This primarily involves covering various events of " +
                        "the college , writing press releases , taking photographs and ensuring  that each and every event of " +
                        "the college gets its due media coverage.\n" +
                        "Newsletter – The club designs and compiles the official newsletter of PEC University of Technology" +
                        " which contains all the events and happenings of the campus, research papers published and  national " +
                        "and international conferences attended by the faculty members.\n" +
                        "Website and Facebook Page – The club provides content for periodic updation of the college’s website." +
                        " Also the official Facebook page of college PEC University of Technology [Official]  is managed by the " +
                        "students of Communication Club.";
                break;

            case R.id.drams:
                imageView=(ImageView) findViewById(R.id.imagedrams);
                clubNameToSend="Dramatics";
                clubDescription="The journey of a Dramchee begins with an exuberant Recruitment workshop where an endeavour" +
                        " to add new members to the Dramatics family is made by giving them a glimpse of and instilling in " +
                        "them our core values which are Punctuality, Dedication and Enthusiasm.Besides this, we conduct professional" +
                        " acting workshops in which our members are tutored by professional theatre artists to hone their skills and" +
                        " help them realise their acting potential to the fullest so that they can represent the college on national" +
                        " platforms to bring laurels to the institution's already jeweled legacy.";
                break;

            case R.id.eic:
                imageView=(ImageView) findViewById(R.id.imageeic);
                clubNameToSend="EIC";
                clubDescription="To foster the spirit of entrepreneurship among students and create an exhaustive resource pool " +
                        "to aid potential student entrepreneurs.The Entrepreneurship Cell of PEC responsible for conducting mentorship" +
                        " sessions,lectures ,workshops,Business Plan Competitions,Informative Sessions,Virtual Stock/Real Estate Markets," +
                        "IPL Auctions and many more activities.";
                break;

            case R.id.ieee:
                imageView=(ImageView) findViewById(R.id.imageieee);
                clubNameToSend="IEEE";
                clubDescription="The Institute of Electrical and Electronics Engineers (IEEE) is a professional association dedicated" +
                        " to advancing technological innovation and excellence. It has about 425,000 members in about 160 countries.\n"
                        +             "\n" +
                        "The Student Chapter of IEEE in PEC was started in 2001 by Dr. Gurnam Singh. With 100+ active members, IEEE-PEC" +
                        " has been the strongest technical society not only in institute but entire region, for years it has served as" +
                        " a platform, with objective of spreading knowledge for enhancement of computer science, electrical and " +
                        "electronics engineers. Be it regular interactions, workshops, events or competitions, IEEE PEC has done " +
                        "it all. Guest lectures have been an old tradition and we have hosted Dr. Ravi Sehgal (MD, General Electric), "
                        +    "Er. Ashish Jain (DGM, ONGC), just to name a few.";
                break;

            case R.id.iete:
                imageView=(ImageView) findViewById(R.id.imageiete);
                clubNameToSend="IETE";
                clubDescription="The Institution of Electronics and Telecommunication Engineers (IETE) is India’s leading recognised " +
                        "professional society devoted to the advancement of Science and Technology of Electronics, Telecommunication" +
                        " & IT. Founded in 1953, it serves more than 60,000 members through various centres, whose number is 65, spread " +
                        "all over India and abroad. The Institution provides leadership in Scientific and Technical areas of direct " +
                        "importance to the national development and economy. Government of India has recognised IETE as a Scientific" +
                        " and Industrial Research Organization (SIRO) and also notified as an educational Institution of national" +
                        " eminence. The objectives of IETE focus on advancing electro-technology. The IETE conducts and sponsors " +
                        "technical meetings, conferences, symposia, and exhibitions all over India, publishes technical journals " +
                        "and provides continuing education as well as career advancement opportunities to its members.\n" +
                        "\n";
                break;

            case R.id.music:
                imageView=(ImageView) findViewById(R.id.imagemusic);
                clubNameToSend="Music";
                clubDescription="The Music Club, one of the most prestigious and popular clubs of the institute has the responsibility " +
                        "of creating the sense of musical aura across the campus. The members of the club take part in various intra" +
                        " and inter institute events throughout the year along with hosting various musical performances in the " +
                        "institute throughout the two semesters. Year around workshops are organised that cover all genres of " +
                        "music- Bollywood, western, Punjabi, pop, rock and rap.\n" +     "\n" +
                        "The Club is a major contributor to intra institute activities including Independence Day celebrations," +
                        " Republic Day celebrations etc. The club is also the principal host of SPIC MACAY (Society for Promotion" +
                        " of Indian Classical Music among Youth).The Club hosts various events throughout the two semesters with" +
                        " musical performances by the members of the club. The first performance CHORDS is the biggest event of " +
                        "the club in the 1st semester of every year, in which the new recruits of the club are introduced. It is" +
                        " closely followed by FRIDAY NIGHTS which is a new initiative that takes place in the student hub, PEC-Market, " +
                        "showcasing performances majorly by the third year. The second semester is started with ENCORE which contains " +
                        "an explosive mixture of performances from various members. The last event of the club is INTERLUDE which is" +
                        " the last performance of the year reserved majorly for the graduating year.";
                break;

            case R.id.pdc:
                imageView=(ImageView) findViewById(R.id.imagepdc);
                clubNameToSend="PDC";
                clubDescription="Projection Design Club, one of the prominent clubs of PEC, makes Short films/Documentaries, " +
                        "showcase movies, organizes events throughout the year, covers, directs and edits the video footage " +
                        "of all the events of PEC, designs posters, flexes and marketing brochures for various events like " +
                        "PECFEST, Cultural Marathon, Open house etc.\n" +
                        "\n" +
                        "The club conducts workshops for the students through which the club members acquire proficiency " +
                        "in designing software such as Adobe Photoshop, Adobe After Effects, Adobe Premiere and Adobe Audition. " +
                        "The club also conducts Camera Handling workshop where various movie directional skills like handling " +
                        "a camera, taking various shots, enhancing video features are taught. The club runs a YouTube Channel " +
                        "where we upload our original documentaries. Some of which are Life at an Angle, Sukhna Diaries, The " +
                        "Diary – Handle With Care, Blood Donation Camp, Mock Drill @ PEC, Paper Wastage etc. Other achievements " +
                        "of the club are available in the club’s annual magazine. ";
                break;

            case R.id.pecsitt:
                imageView=(ImageView) findViewById(R.id.imagepecsitt);
                clubNameToSend="PECSITT";
                clubDescription="We are a student-run organization at PEC University of Technology aimed at development of " +
                        "Computer Science on campus through participating in competitions and working on projects.";
                break;

            case R.id.ped:
                imageView=(ImageView) findViewById(R.id.imageped);
                clubNameToSend="Punjabi Ed Board";
                clubDescription="Punjabi Editorial Board provides a platform to indulge in Punjabi culture by its writings, " +
                        "bhangra and plays. The power of writings infuses life to PECMag & newsletter.Bhangra performances" +
                        " in Bhangra Theque and other events fill PEC’s atmosphere with colorfullness and enthusiasm. " +
                        "It promotes Punjabi culture & creates awareness about its past which is now under adverse effects " +
                        "of drug addiction";
                break;

            case R.id.robotics:
                imageView=(ImageView) findViewById(R.id.imagerobotics);
                clubNameToSend="Robotics";
                clubDescription="The ‘PEC Robotics Society’ is the foremost technical societies in ‘PEC University of Technology’." +
                        " We have the smartest minds working in sync to create the future of robotics. There are members from " +
                        "every branch, be it ircuital or non circuital with only one thing in common, curiosity. If you ever" +
                        " wanted to know the ins and outs of robotics, or better, make your own robots, then this is the place" +
                        " for you!! We teach you everything you need to know, to build robots and gadgets, ranging from line" +
                        " followers, to gesture controlled bots, to Quadcopter’s and much more. Additionally you get to be part" +
                        " of the various events, workshops and competitions that the society holds annually. That’s not all! You" +
                        " get to decide the project you want to work on and we provide the money and support to your endeavors. " +
                        "The society works on the principle of ‘learn and teach’; hence there will be seniors, around the clock " +
                        "to help you resolve an issue. You can build your bots’ and enter various technical fests held in the " +
                        "top institutes of the country. Many IIT’s feature on the list. These competitions offer lucrative cash" +
                        " prizes. The opportunities our society provides are abundant, but to avail them you have to be a part " +
                        "of it. The question stands, are you smart enough? Every member of the society gets recruited after grueling" +
                        " written test and a personal interview. So if you think you have the passion, the élan to create the future" +
                        " then you could be the next.";
                break;

            case R.id.rotoract:
                imageView=(ImageView) findViewById(R.id.imagerotoract);
                clubNameToSend="Rotoract";
                clubDescription="Rotaract Club, PEC, Chandigarh is a youth program of the prestigious Rotary International under the " +
                        "district code 3080. It is supported by the Rotary Club Chandigarh. It aims to promote the virtue of responsible" +
                        " leadership by providing promising youngsters the opportunity to better understand, embody, and promote the " +
                        "characteristics of responsible citizenship and effective leadership.\n" +
                        "\n" +
                        "Some of the events undertaken to fulfill the aforementioned objective include eye camps, visits to" +
                        " orphanages and old age homes, Rotaract Cricket League, Couture with rags, Inbox, blood drives, debates " +
                        "etc.\n" +
                        "\n" +
                        "Last session saw Rotaract Club initiating yet another act to help reach out to the less privileged by" +
                        " starting an event of candle selling. The deaf and dumb students from one of the homes from the city " +
                        "were encouraged to make candles which were then sold to the students of the college. The initiative " +
                        "was warmly received by the students who bought candles in large numbers. The proceeds were then used " +
                        "to buy essentials for the welfare of the candle makers.";
                break;

            case R.id.saasc:
                imageView=(ImageView) findViewById(R.id.imagesaasc);
                clubNameToSend="SAASC";
                clubDescription="SAASC, also known as the Speakers’ Association and Study Circle is the college’s only official literary " +
                        "club. It is responsible for initiating logical thinking, creativity and a sense of leadership within the students." +
                        " The three forums that SAASC supports are quizzing, writing and speaking for which SAASC as an organization helps" +
                        " the budding engineers of PEC develop a lot of important skills necessary for their growth not only academically" +
                        " but also socially.\n" +
                        "\n" +
                        "Among the many events this club has hosted, in order to develop the above mentioned skills in students, has been" +
                        " PEC’s only literary fest – Verve’. Verve is a challenging fest which allows an individual to improve his or her " +
                        "thinking capability and also help inculcate communication skills. At Verve we hosted a series of events ranging" +
                        " from parliamentary debates, group discussions, just a minute sessions, quizzes which saw the participation of " +
                        "students not only from the college but from all over the tricity as well. Cash prizes up to a whopping amount of " +
                        "1 Lakh were awarded to the winners.";
                break;

            case R.id.scc:
                imageView=(ImageView) findViewById(R.id.imagescc);
                clubNameToSend="SCC";
                clubDescription="The office of the counselling services aims at helping students reach their highest academic and" +
                        " personal potential. This may involve helping with personal, learning and career concerns and promoting " +
                        "success and wellness among them. The office provides a confidential atmosphere in which the students can" +
                        " explore any topic or situation and discuss any concerns thy may have. The students are helped to work " +
                        "through their problems, to develop self-awareness and to overcome problems.\n" +
                        "\n" +
                        "The office offers free counselling to students on individual or group basis. The counselling cell also " +
                        "provides testing facilities which includes psychological testing and psychiatry.\n" +
                        "\n" +
                        "The counselling cell has a peer help group fondly known as “Happy Folks” of PEC comprising students from " +
                        "all branches and years. They are the volunteers who work in order to create a cheerful atmosphere in the" +
                        " college by organising regular interactive activities and motivating sessions, always ready to wor for " +
                        "the welfare of the students.";
                break;

            case R.id.sme:
                imageView=(ImageView) findViewById(R.id.imagesme);
                clubNameToSend="SME";
                clubDescription="The objective of the society is to enhance progress and prosperity in human community and " +
                        "its members through advance manufacturing.\n" +
                        "\n" +
                        "About SME:\n" +
                        "\n" +
                        "Society of Manufacturing Engineers (SME) is a non-profit organization. Past eight decades it has" +
                        " been serving the needs its members, customers and manufacturing through its various products and " +
                        "services. Through its strategic areas of events, media, membership, training and development, and" +
                        " the SME Education Foundation, SME is uniquely dedicated to advancing manufacturing by addressing " +
                        "both knowledge and skill needs for industry. The motto of SME is “Making the Future Together”.";
                break;
        }
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View hView =  navigationView.getHeaderView(0);
        TextView nav_user = (TextView)hView.findViewById(R.id.studentName);

        imageView.buildDrawingCache();
        bmp=imageView.getDrawingCache();

        //Convert to byte array
        stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byteArray = stream.toByteArray();

        intent.putExtra("imagebyte",byteArray);
        intent.putExtra("clubname",clubNameToSend);
        intent.putExtra("description",clubDescription);
        intent.putExtra("studentname",nav_user.getText());
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        setContentView(R.layout.activity_home);
      //  openDialog();
     //   getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.mytitle);
/*

        apc= (Button) findViewById(R.id.button1);
        music= (Button) findViewById(R.id.button2);
        drams= (Button) findViewById(R.id.button3);
        saasc= (Button) findViewById(R.id.button4);
        pdc= (Button) findViewById(R.id.button5);
        enviro= (Button) findViewById(R.id.button6);
        rotoract= (Button) findViewById(R.id.button7);
        edc= (Button) findViewById(R.id.button8);
        communication= (Button) findViewById(R.id.button9);
        iste= (Button) findViewById(R.id.button10);
        ioe= (Button) findViewById(R.id.button11);
        iete= (Button) findViewById(R.id.button12);
        ieee= (Button) findViewById(R.id.button13);
        sae= (Button) findViewById(R.id.button14);
        iim= (Button) findViewById(R.id.button15);
        aesi= (Button) findViewById(R.id.button16);
        sme= (Button) findViewById(R.id.button17);
        sesi= (Button) findViewById(R.id.button18);
        asi= (Button) findViewById(R.id.button19);

*/

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
     //   studentName= (TextView) findViewById(R.id.studentName);
        Bundle inBundle = getIntent().getExtras();
        String  name = inBundle.get("name").toString();
        //String  surname = inBundle.get("surname").toString();
        String imageUrl = inBundle.get("imageUrl").toString();
        String sid=inBundle.get("sid").toString();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View hView =  navigationView.getHeaderView(0);

        TextView nav_user = (TextView)hView.findViewById(R.id.studentName);
        nav_user.setText(name);
        TextView sidView= (TextView)hView.findViewById(R.id.sidView);
        sidView.setText(sid);
       // studentImage= (ImageView)hView.findViewById(R.id.studentImage);

       new DownloadImage((ImageView)hView.findViewById(R.id.studentImage)).execute(imageUrl);



    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }
    }


    private TextView textInfo;





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
//            try {
//                File dir = getApplicationContext().getCacheDir();
//                deleteDir(dir);
//            } catch (Exception e) {}
//
////
//Intent intent=new Intent (this,fbLoginActivity.class);
//           startActivity(intent);
             finish();
          //  return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


if(id == R.id.nav_admin) {
    Intent i = new Intent(this, AdminHome.class);
    startActivity(i);
}

        if(id == R.id.nav_applications) {
            Intent i = new Intent(this, MyActivities.class);
            startActivity(i);
        }
        if(id == R.id.logout) {
//            Intent i = new Intent(this, fbLoginActivity.class);
//
//            startActivity(i);
        }

        if(id == R.id.MyScore) {
            Intent i = new Intent(this, CurrentScore.class);
            startActivity(i);
        }




//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
