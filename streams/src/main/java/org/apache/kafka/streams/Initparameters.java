package org.apache.kafka.streams;

public class Initparameters {

    public static Initparameters initparameters;                      // specifies to disable the setup of internal topics if some topics are missing. Leverage validation introduced in 

    public Initparameters enableSetupInternalTopicsIfIncomplete;     // specifies to setup repartition and changelog topics if some are missing
    public Initparameters disableSetupInternalTopicsIfIncomplete;    // specifies to throw some buytn ot all repartition or changelog topics are missing
    public boolean setupInternalTopicsIfIncompleteEnabled;          // Getter

}
