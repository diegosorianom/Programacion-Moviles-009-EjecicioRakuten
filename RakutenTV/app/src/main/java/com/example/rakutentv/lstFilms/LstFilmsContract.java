package com.example.rakutentv.lstFilms;


import com.example.rakutentv.beans.Film;

import java.util.ArrayList;

public interface LstFilmsContract {

    public interface View {
        void sucessListFilms(ArrayList<Film> lstFilms);
        void failureListFilms(String message);

    }
    public interface Presenter {
        void getFilms();
    }
    public interface Model {
        /*Programación Reactiva*/
        interface OnLstFilmsListener {
            void onFinished(ArrayList<Film> lstFilms);

            void onFailure(String error);
            }
            void getFilmsService(OnLstFilmsListener onLstFilmsListener);

    }
}
