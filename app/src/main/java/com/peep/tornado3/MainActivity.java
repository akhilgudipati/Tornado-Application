package com.peep.tornado3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner1,spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         spinner1 = findViewById(R.id.states);
         spinner2 = findViewById(R.id.counties);
        spinner1.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sp1= String.valueOf(spinner1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if(sp1.contentEquals("Alabama")) {
            List<String> list = new ArrayList<>();
            list.add("Jefferson");
            list.add("Autauga");
            list.add("Etowah");
            list.add("Baldwin");
            list.add("Shelby");
            list.add("Mobile");
            list.add("Calhoun");
            list.add("Tuscaloosa");
            list.add("Cleburne");
            list.add("Conecuh");
            list.add("Elmore");
            list.add("Lee");
            list.add("Madison");
            list.add("Escambia");
            list.add("Marengo");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Alaska")) {
            List<String> list = new ArrayList<String>();
            list.add("Anchroage");
            list.add("Sitka");
            list.add("Juneau");
            list.add("Matanuska-Sustine");
            list.add("Northerst Arctic");
            list.add("Fairbanks North Star");
            list.add("Kenai Peninsula B");
            list.add("Yakutat");
            list.add("Kodiak Island");
            list.add("North SLope");
            list.add("Ketchikan Gateway");
            list.add("Ajeutians East");
            list.add("Aleutians");
            list.add("Yukon-Koyukuk");
            list.add("Lake and Peninsula");
            list.add("Southeast Fairbanks");
            list.add("Valdez-Cordova");
            list.add("Hoonah Angoon");
            list.add("Bristal Bay");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("Arizona")) {
            List<String> list = new ArrayList<>();
            list.add("Maricopa");
            list.add("Pima");
            list.add("Mohave");
            list.add("Coconino");
            list.add("Pinal");
            list.add("Yavapai");
            list.add("Cochise");
            list.add("Yuma");
            list.add("La Paz");
            list.add("GreenLee");
            list.add("Graham");
            list.add("Gila");
            list.add("Apache");
            list.add("Navajo");
            list.add("Santa Cruz");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("Arkansas")) {
            List<String> list = new ArrayList<>();
            list.add("Arkansas");
            list.add("Pulakju");
            list.add("Craighead");
            list.add("Desha");
            list.add("Crittenden");
            list.add("Washington");
            list.add("Hempstead");
            list.add("Saline");
            list.add("Yell");
            list.add("Pontsett");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("California")) {
            List<String> list = new ArrayList<>();
            list.add("Countra Costa");
            list.add("Siskiyou");
            list.add("Humboldt");
            list.add("Placer");
            list.add("Stanislaus");
            list.add("San Francisco");
            list.add("Los Angeles");
            list.add("Plumas");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Colorado")) {
            List<String> list = new ArrayList<>();
            list.add("Denver");
            list.add("El Paso");
            list.add("Weld");
            list.add("Larimer");
            list.add("Boomfield");
            list.add("Arapahoe");
            list.add("Huerfano");
            list.add("Prowers");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Connecticut")) {
            List<String> list = new ArrayList<>();
            list.add("New Haven");
            list.add("FairFeild");
            list.add("Hartford");
            list.add("Litchfield");
            list.add("MiddleSEX");
            list.add("Tolland");
            list.add("Windham");
            list.add("New London");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Delaware")) {
            List<String> list = new ArrayList<>();
            list.add("New Castle");
            list.add("Sussex");
            list.add("Kent");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("Florida")) {
            List<String> list = new ArrayList<>();
            list.add("Broward");
            list.add("Miami-Dade");
            list.add("Palm Beach");
            list.add("Pinellas");
            list.add("Duval");
            list.add("Volusia");
            list.add("Collier");
            list.add("Hillsborough");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("Georgia")) {
            List<String> list = new ArrayList<>();
            list.add("Gwinnett");
            list.add("DeKalb");
            list.add("Forsyth");
            list.add("Bibb");
            list.add("Coweta");
            list.add("Habesham");
            list.add("Paulding");
            list.add("Troup");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("Hawaii")) {
            List<String> list = new ArrayList<>();
            list.add("Hawaii");
            list.add("Maui");
            list.add("Honolulu");
            list.add("Kauai");
            list.add("Kalwao");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("Idaho")) {
            List<String> list = new ArrayList<>();
            list.add("Idaho");
            list.add("Kootenai");
            list.add("Latah");
            list.add("Owyhee");
            list.add("Fremont");
            list.add("Bonneville");
            list.add("Ada");
            list.add("New Perce");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("Indiana")) {
            List<String> list = new ArrayList<>();
            list.add("Vanderburgh");
            list.add("Warrick");
            list.add("Blackford");
            list.add("Tippecanoe");
            list.add("Marion");
            list.add("Kosciusko");
            list.add("Daviess");
            list.add("Dearborn");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }

        if(sp1.contentEquals("choose country")) {
            List<String> list = new ArrayList<>();
            list.add("");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter);
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
