package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.framwork.annotations.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestPostService {
    private final TestPostRepository testPostRepository;
}
