package com.satya.java.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DirectoryItaration {

	public static void main(String[] args) {

		
		String path="H:\\FNRC_DOSpOS_PDF\\300\\30002001\\0947\\101830002001094701929";
		try{
			List<String> ll=Files.list(Paths.get(path)).map(i->i.toString()).collect(Collectors.toList());
			ll.forEach(i->{
				System.out.println(i);
			});
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
