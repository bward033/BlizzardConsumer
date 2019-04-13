package com.ssu385.blizzardconsumer.boss.interactor;


import com.ssu385.blizzardconsumer.core.model.Boss;
import com.ssu385.blizzardconsumer.core.model.BossList;
import com.ssu385.blizzardconsumer.network.BossListAsyncTask;

/*
    Concrete implementation of the BossInteractor meant to retrieve a collection of boss data from a
    remote API
 */
public class BossListInteractor implements BossInteractor {
    @Override
    public void getBossData(String id, final BossDataCallback callback) {
        //implement logic to retrieve data from remote API here
        BossListAsyncTask task = new BossListAsyncTask();
        task.setBossListResponseListener(new BossListAsyncTask.BossListResponseListener() {
            @Override
            public void onBossListResponse(BossList bosses) {


                Boss[] bossArray = new Boss[bosses.getBosses().size()];
                bosses.getBosses().toArray(bossArray);
                callback.onBossDataCallback(bossArray);
            }





        });
        task.execute();

    }
}
