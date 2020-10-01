import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.princeton.cs.algs4.*;

public class ShortestPath {
	public static void main (String[] args)
	{
		MetroGraph1 mG = null;
		try {
			mG = new MetroGraph1(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + args[0]);
		}
		Graph G=mG.getGraph();
		Map<Integer,Platform> platformMap = mG.getPlatformData();
		BreadthFirstPaths paths = new BreadthFirstPaths(G, 69);
		Iterable<Integer> itr = paths.pathTo(69);
		for (int i : itr)
		{
			Platform p = platformMap.get(i);
			System.out.println(p.getStationName() + " (" + p.getTrainLine() + ")");
		}
		
	}
}
