package com.pablo.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.pablo.compose.Article
import java.util.UUID

@Composable
fun ArticleListItem(article: Article, onItemClick: () -> Unit) {
    Column(modifier = Modifier.clickable { onItemClick() }.padding(16.dp)) {
        val imageUrl = remember { "https://picsum.photos/400/300?random=${article.id}&${UUID.randomUUID()}" }

        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = "Imagen del artículo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Text(text = article.title)
    }
}

@Composable
fun ArticleListScreen(navController: NavController) {
    val articles = Repositorio.getArticles()

    LazyColumn {
        items(articles) { article ->
            ArticleListItem(article = article) {
                navController.navigate("articleDetail/${article.id}")
            }
        }
    }
}
