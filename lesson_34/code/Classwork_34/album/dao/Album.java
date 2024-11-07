package Classwork_34.album.dao;

import Classwork_34.album.model.Photo;

import java.time.LocalDate;

public interface Album {

     boolean addPhoto(Photo photo);
     boolean removePhoto(int albumId, int photoId);
     boolean updatePhoto(int albumId, int photoId,String url);
      Photo getPhotoFromAlbum(int albumId, int photoId);
    Photo [] getPhotoFrom(int albumId);
    Photo [] getPhotoBetweenDate(LocalDate dateFrom,LocalDate dateTo);
    int  size();

}
