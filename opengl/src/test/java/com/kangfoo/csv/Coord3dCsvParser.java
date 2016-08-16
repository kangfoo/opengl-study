package com.kangfoo.csv;

import org.jzy3d.maths.Coord3d;

public class Coord3dCsvParser extends CsvParser {
    private static final long serialVersionUID = 114535243324747895L;
    
    public Coord3dCsvParser() {
        super();
    }

    public Coord3dCsvParser(ColumnMappingCoord mapping) {
        super(mapping);
    }

    public Coord3dCsvParser(String separator, ColumnMappingCoord mapping) {
        super(separator, mapping);
    }

    public Coord3d call(String line) throws Exception {
        String[] lineStrings = line.split(separator);
        Coord3d entry = parseCoord3d(lineStrings);
        return entry;
    }
}
