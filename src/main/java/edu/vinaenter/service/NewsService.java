package edu.vinaenter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.vinaenter.models.News;

@Service
public class NewsService {

	public List<News> getList() {
		News news = new News(1, "Tin tức 1");
		News news2 = new News(2, "Tin tức 2");
		News news3 = new News(3, "Tin tức 3");
		News news4 = new News(4, "Tin tức 4");
		List<News> newsList = new ArrayList<>();
		newsList.add(news);
		newsList.add(news2);
		newsList.add(news3);
		newsList.add(news4);
		return newsList;
	}
}
