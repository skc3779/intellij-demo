package com.jetbrains.function;

import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by seokangchun on 15. 4. 19..
 */
public class MoodChartData implements MessageListener {
    private final PieSlice sadPortion = new PieSlice("Sad");
    private final PieSlice happyPortion = new PieSlice("Happy");

    public ObservableList<PieChart.Data> getPieChartData() {
        return null;
    }


    @Override
    public void onMessage(Message message) {
        try {
            String type = message.getJMSType();

            if(type.equals("sad")) {
                sadPortion.increment();
            }

            if(type.equals("happy")) {
                happyPortion.increment();
            }

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
