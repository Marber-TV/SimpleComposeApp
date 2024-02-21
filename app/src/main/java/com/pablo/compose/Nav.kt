package com.pablo.compose

import ArticleDetailScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Nav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "articleList") {
        composable("articleList") {
            ArticleListScreen(navController = navController)
        }
        composable("articleDetail/{articleId}") { backStackEntry ->
            val articleId = backStackEntry.arguments?.getString("articleId")?.toIntOrNull()
            if (articleId != null) {
                ArticleDetailScreen(articleId = articleId)
            }
        }
    }
}
