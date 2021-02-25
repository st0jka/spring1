package com.prvi.proj.service;

import com.prvi.proj.dto.KonvertDTO;

import java.io.IOException;
import java.util.Set;

public interface MenjacnicaService {
    Set<String> dobaviListuValuta();
    String result(KonvertDTO konvertDto) throws IOException;

}

