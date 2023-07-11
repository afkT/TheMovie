package afkt.movie.module.person

import afkt.movie.core.lib.base.app.BaseViewModel

class PersonViewModel(
    private val repository: PersonRepository = PersonRepository()
) : BaseViewModel()