package org.example.neuefische_start_point;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@Data
@RequiredArgsConstructor
public class Book {


    private final String isbn;
    private final String name;
}
