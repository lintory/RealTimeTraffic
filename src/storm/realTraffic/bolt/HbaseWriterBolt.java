package storm.realTraffic.bolt;


//import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Map;

import storm.realTraffic.spout.TupleInfo;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Tuple;


public class HbaseWriterBolt implements IRichBolt {	



	public void prepare(Map stormConf, TopologyContext context,
			OutputCollector collector) {
		// TODO Auto-generated method stub
		
	}



	public void execute(Tuple input) {
		// TODO Auto-generated method stub
		
	}



	public void cleanup() {
		// TODO Auto-generated method stub
		
	}



	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}



	public Map<String, Object> getComponentConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}


}
