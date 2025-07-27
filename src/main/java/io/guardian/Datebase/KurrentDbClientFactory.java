package io.guardian.Datebase;

import io.kurrent.dbclient.KurrentDBClient;
import io.kurrent.dbclient.KurrentDBClientSettings;
import io.kurrent.dbclient.KurrentDBConnectionString;

public class KurrentDbClientFactory {
    private static KurrentDBClient client;

    public static KurrentDBClient getClient() {
        if(client == null) {
            KurrentDBClientSettings settings = KurrentDBConnectionString.parseOrThrow("kurrentdb+discover://localhost:2113");
            client = KurrentDBClient.create(settings);
        }
        return client;
    }
}
