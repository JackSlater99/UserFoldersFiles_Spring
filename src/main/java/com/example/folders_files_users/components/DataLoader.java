package com.example.folders_files_users.components;

import com.example.folders_files_users.models.File;
import com.example.folders_files_users.models.FileType;
import com.example.folders_files_users.models.Folder;
import com.example.folders_files_users.models.User;
import com.example.folders_files_users.repository.FileRepository;
import com.example.folders_files_users.repository.FolderRepository;
import com.example.folders_files_users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Jack");
        userRepository.save(user1);

        User user2 = new User("Jill");
        userRepository.save(user2);

        Folder folder1 = new Folder("Jacks Folder", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Jills Folder", user2);
        folderRepository.save(folder2);

        File file1 = new File("Jacks File", FileType.PYTHON, "1GB", folder1);
        fileRepository.save(file1);

        File file2 = new File("Jills File", FileType.RUBY, "500MB", folder2);
        fileRepository.save(file2);
    }
}
