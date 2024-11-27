package fabdiary.service;

import fabdiary.data.models.Diary;
import fabdiary.data.repositories.DiaryRepositoryImpl;

public class DiaryServiceImplementation implements DiaryService {
    DiaryRepositoryImpl diaryRepository = new DiaryRepositoryImpl();
    private boolean isLoggedIn = false;
    @Override
    public Diary login(String username, String password) {
//        if(userNameExist(username) && isCorrect(password)) {
//
//            return ;
//        }else {
//            return throw new IllegalArgumentException("Invalid username or password");
//        }
        return null;
    }

    @Override
    public void register(String username, String password) {
        if(userNameExist(username)) {throw new IllegalArgumentException();}
        Diary diary = new Diary(username, password);
        diaryRepository.save(diary);
    }

    @Override
    public void deleteDiary(String username) {

    }

    public int count() {
        return diaryRepository.count();
    }

    public Diary findByUserName(String username) {
        Diary diary = diaryRepository.findByUserName(username);
        return diary;
    }
    public boolean userNameExist(String username) {
        return  diaryRepository.existByUserName(username);
    }
    public boolean isCorrect(String password) {
        return diaryRepository.getPassword(password);
    }





}
