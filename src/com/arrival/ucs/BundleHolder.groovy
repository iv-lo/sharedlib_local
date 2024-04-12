package com.arrival.ucs

class BundleHolder extends BundleHolderClazz {
    BundleHolder(def pipeline) {
        super(pipeline)
        _bundles = [
            "Mustang_v1": [
                new Project(pipeline, "//depot/auto/projects/TX/TX_MUSTANG1/ms_DCU"     , "0.0.42.0", "now"),
                new Project(pipeline, "//depot/auto/projects/TX/TX_MUSTANG1/ms_io_FL"   , "0.0.14.0", "now"),
                new Project(pipeline, "//depot/auto/projects/TX/TX_MUSTANG1/ms_io_FR"   , "0.0.12.0", "now"),
                new Project(pipeline, "//depot/auto/projects/TX/TX_MUSTANG1/ms_io_RR"   , "0.0.8.0" , "now"),
                new Project(pipeline, "//depot/auto/projects/TX/TX_MUSTANG1/ms_PDM1"    , "0.0.9.0" , "now"),
                new Project(pipeline, "//depot/auto/projects/TX/TX_MUSTANG1/ms_PDM2"    , "0.0.11.0", "now")
            ],
            "Mustang_v2": [
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/DCUv5/DCUv5_MS2_DCU" , "0.0.22.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/IO_V4/V4A_MS2_IOCD"  , "0.0.20.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/IO_V4/V4A_MS2_IOCC"  , "0.0.18.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/IO_V4/V4A_MS2_IOCF"  , "0.0.18.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/IO_V4/V4A_MS2_IOFL"  , "0.0.18.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/IO_V4/V4A_MS2_IOFR"  , "0.0.19.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS2/IO_V4/V4A_MS2_IORR"  , "0.0.18.0", "now")
            ],
            "Mustang_v3": [
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/DCUv5/DCUv5_MS4_DCU" , "0.1.1.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOFL"  , "0.1.0.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOFR"  , "0.1.0.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOCD"  , "0.1.0.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IORR"  , "0.1.0.0", "now")
            ],
            "Mustang_v4": [
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/DCUv5/DCUv5_MS4_DCU" , "0.5.0.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOFL"  , "0.1.8.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOFR"  , "0.1.9.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOCD"  , "0.1.8.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IOCC"  , "0.1.9.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IORR"  , "0.1.9.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IODD"  , "0.1.8.0", "now"),
                new Project(pipeline, "//depot/auto/cs_projects/CHARGE_MS3/IO_V4/V4A_MS4_IODP"  , "0.1.8.0", "now")
            ],
            "Mustang_v5": [
                new Project(pipeline, "//application_software/ucs/Ecus/Charge67/Ms6Dcu" , "0.23.1.7", "now"),
                new Project(pipeline, "//vehiclemodels/vehicle_models/prod/Charge67/Ms5", "0.23.1.3", "now")
            ],
            "Mustang_v6": [
                new Project(pipeline, "//application_software/ucs/Ecus/Charge67/Ms6Dcu" , "0.23.1.7", "now"),
                new Project(pipeline, "//vehiclemodels/vehicle_models/prod/Charge67/Ms6", "0.23.1.1", "now")
            ]
        ]
        this._defaultVehicle = 'Mustang_v6'
    }
}