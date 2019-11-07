package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Image;


@Service
public class ImageServiceImpl implements ImageService {

	private ImageRepository imageRepository;
	@Override
	@Transactional

	public List<Image> getAllCourses() {
		// TODO Auto-generated method stub
		return imageRepository.findAll();
	}

	@Override
	public void createImage(Image image) {
		imageRepository.save(image);
		
	}

	@Override
	public Optional<Image> getImageById(int theId) {
		Optional<Image> course=imageRepository.findById(theId);
		return course;
	}

	

}