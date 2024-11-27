package fabdiary.data.repositories;

import fabdiary.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    List<Diary> diaries = new ArrayList<Diary>();



    @Override
    public Diary save(Diary diary) {
        diaries.add(diary);
        return diary;
    }

    @Override
    public Diary findByUserName(String username) {
        for (Diary diary : diaries) {
            if(diary.getUsername().equals(username)){
                return diary;
            }
        }
        return null;
    }

    @Override
    public void delete(Diary diary) {
//       if(diaries.isEmpty()){throw new IllegalArgumentException();}
            for (int diary1 = 0; diary1 < diaries.size(); diary1++ ) {
                if(diaries.get(diary1).equals(diary)){
                    diaries.remove(diary1);
                }
            }

    }

    @Override
    public boolean existByUserName(String username) {
        for (Diary diary : diaries ) {
            if(diary.getUsername().equals(username)){
               return true;
            }
        }
        return false;
    }



    public int  count() {
        return diaries.size();
    }


    public boolean getPassword(String password) {
        for (Diary diary : diaries) {
            if(diary.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public void lockDiary(boolean lock) {
        Diary diary = new Diary();
        diary.setLocked(lock);
    }

    public boolean isLoggedIn() {
        Diary diary = new Diary();
        return diary.isLocked();
    }
}
