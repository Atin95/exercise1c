package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter 
{
	private static final Logger log = LogManager.getLogger();
	
    public int[] convertToInts(String[] strings) 
    {
    	log.debug("convertToInts entered [strings={}]", Arrays.toString(strings));
    	int[] result = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    	log.debug("convertToInts left [result]", Arrays.toString(result));
        return result;
    }
}
