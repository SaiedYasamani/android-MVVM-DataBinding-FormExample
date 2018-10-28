package com.alimuzaffar.testproject.ui.main;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.ViewModel;

public class mainViewModel extends ViewModel {

    public RequestDTO requestDTO;
    public List<String> reasonsList;

    public void init(){
        prepareReasonsList();
        prepareRequestDTO();
    }

    private void prepareRequestDTO() {
        List<String> selectedReasons = new ArrayList<>();
        requestDTO = new RequestDTO(selectedReasons,null,null,null);
    }

    private void prepareReasonsList() {
        reasonsList = new ArrayList<>();
        reasonsList.add("req1");
        reasonsList.add("req2");
        reasonsList.add("req3");
        reasonsList.add("req4");
        reasonsList.add("req5");
        reasonsList.add("req6");
    }
}
