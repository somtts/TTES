/**
 * Copyright 2007 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * This file is part of MARY TTS.
 *
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package marytts.signalproc.adaptation.prosody;

import java.io.IOException;

import marytts.util.io.MaryRandomAccessFile;


/**
 * @author Oytun T&uumlrk
 *
 */
public class PitchMappingFileHeader {
    public int totalF0StatisticsEntries;
  
    public PitchMappingFileHeader()
    {
        this(0);
    } 
    
    public PitchMappingFileHeader(int totalF0StatisticsEntriesIn)
    {
        totalF0StatisticsEntries = totalF0StatisticsEntriesIn;
    } 
    
    public PitchMappingFileHeader(PitchMappingFileHeader h)
    {
        totalF0StatisticsEntries = h.totalF0StatisticsEntries;
    } 
    
    public void resetTotalEntries()
    {
        totalF0StatisticsEntries = 0;
    }

    public void read(MaryRandomAccessFile ler) throws IOException
    {   
        totalF0StatisticsEntries = ler.readInt();
    }
    
    public void write(MaryRandomAccessFile ler) throws IOException
    {
        ler.writeInt(totalF0StatisticsEntries);
    }
}

