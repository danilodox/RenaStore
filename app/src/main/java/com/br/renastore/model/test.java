/*
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/linearLayout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            tools:context=".activity.MainActivity">



<include layout="@layout/toolbar" />

<RelativeLayout
        android:layout_width="match_parent"
                android:layout_height="300dp">
<com.synnapps.carouselview.CarouselView
        android:id="@+id/carousel"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        app:fillColor="#FFFFFFFF"
        app:pageColor="#00000000"
        app:radius="6dp"
        app:slideInterval="3000"
        app:strokeColor="#FF777777"
        app:strokeWidth="1dp"/>

</RelativeLayout>

<androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">

<ScrollView
            android:id="@+id/scrollView2"
                    android:layout_width="0dp"
                    android:layout_height="0dp"
                    android:layout_marginStart="1dp"
                    android:layout_marginTop="1dp"
                    android:layout_marginEnd="1dp"
                    android:layout_marginBottom="1dp"
                    app:layout_constraintBottom_toBottomOf="parent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent">

<LinearLayout
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="vertical">

<LinearLayout
                    android:layout_width="match_parent"
                            android:layout_height="wrap_content" >

<ImageButton
                        android:id="@+id/imageButton5"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginStart="5dp"
                                android:layout_marginEnd="5dp"
                                android:layout_weight="1"
                                app:srcCompat="@drawable/camisa" />

<ImageButton
                        android:id="@+id/imageButton4"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginStart="5dp"
                                android:layout_marginEnd="4dp"
                                android:layout_weight="1"
                                app:srcCompat="@drawable/calca" />

<ImageButton
                        android:id="@+id/imageButton3"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginStart="5dp"
                                android:layout_marginEnd="4dp"
                                android:layout_weight="1"
                                app:srcCompat="@drawable/saia" />
</LinearLayout>
<LinearLayout
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        >

<TextView
                    android:id="@+id/textView9"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="5dp"
                            android:layout_weight="1"
                            android:fadeScrollbars="false"
                            android:gravity="center"
                            android:text="Blusas" />

<TextView
                    android:id="@+id/textView8"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="2dp"
                            android:layout_weight="1"
                            android:gravity="center"
                            android:text="Calças" />

<TextView
                    android:id="@+id/textView7"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="2dp"
                            android:layout_weight="1"
                            android:gravity="center"
                            android:text="Saias" />
</LinearLayout>

<LinearLayout
                android:layout_width="match_parent"
                        android:layout_height="wrap_content" >

<ImageButton
                    android:id="@+id/imageButton7"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="5dp"
                            android:layout_marginEnd="4dp"
                            android:layout_weight="1"
                            app:srcCompat="@drawable/acessorios" />

<ImageButton
                    android:id="@+id/imageButton6"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginStart="6dp"
                            android:layout_marginEnd="140dp"
                            android:layout_weight="1"
                            app:srcCompat="@drawable/vestido" />
</LinearLayout>
<LinearLayout
                android:layout_width="match_parent"
                        android:layout_height="wrap_content" >

<TextView
                    android:id="@+id/textView6"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:gravity="center"
                            android:text="Acessórios" />

<TextView
                    android:id="@+id/textView5"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginEnd="140dp"
                            android:layout_weight="1"
                            android:gravity="center"
                            android:text="Vestidos" />
</LinearLayout>
<LinearLayout
                android:layout_width="match_parent"
                        android:layout_height="wrap_content" />

</LinearLayout>
</ScrollView>
</androidx.constraintlayout.widget.ConstraintLayout>


<include
        layout="@layout/bottom_navigation"
                android:layout_width="match_parent"
                android:layout_height="56dp" />


</LinearLayout>


 */