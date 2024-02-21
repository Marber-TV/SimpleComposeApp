import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pablo.compose.Repositorio
import java.util.UUID

@Composable
fun ArticleDetailScreen(articleId: Int) {
    val article = Repositorio.getArticleById(articleId)

    Column(modifier = Modifier.padding(16.dp)) {


        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = article.title,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Publicado el: ${article.publishDate}",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = article.summary,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = article.content,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
